package cn.itcast.order.service;

import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import cn.itcast.order.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RestTemplate restTemplate;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        //2.利用restTemplate发送http请求，查询用户
        //2.1 url路径
        String url="http://userservice/user/"+order.getUserId();
        //2.2 发送http请求，实现远程调用  restTemplate可以发送get请求：getForObject  还可以发送post请求:postForObject
        //restTemplate.getForObject方法很智能，它的第二个参数会向你要个返回值类型
        // 也就是说他知道返回的是json  你要的是user对象，它可以自动把json封装到user对象中
        User user = restTemplate.getForObject(url, User.class);
        //3.封装user到order
        order.setUser(user);
        // 4.返回
        return order;
    }
}
