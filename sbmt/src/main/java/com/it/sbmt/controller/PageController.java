package com.it.sbmt.controller;

import com.it.sbmt.model.Orders;
import com.it.sbmt.model.Products;
import com.it.sbmt.service.impl.OrdersServiceImpl;
import com.it.sbmt.service.impl.ProductsServiceImpl;
import com.it.sbmt.util.OrdersIdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/products")
public class PageController {

    @Autowired
    private ProductsServiceImpl productsService;

    @Autowired
    private OrdersServiceImpl ordersService;

    @GetMapping("/getallproducts")
    public String getAllProductsInfo(HttpServletRequest request){

        List<Products> list = productsService.getAllProducts();
        request.setAttribute("AllProducts",list);

        return "index";
    }

    @GetMapping("/doadd")
    public String doadd(@RequestParam(required=false) Integer productId){

        if(productId!=null){
            String ordersNum = OrdersIdUtils.getOrderIdByTime();
            Integer OrdersDetails = productId;
            Orders orders = new Orders();
            orders.setOrderNum(ordersNum);
            orders.setOrderDetails(OrdersDetails);
            int cols = ordersService.doadd(orders);
            if (cols==1){
                int colss= productsService.updateDeleteCounts(productId);
                if(colss!=0){
                    return "Success";
                }else{
                    try {
                        throw new Exception("countdeleteone failed");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }else {
                try {
                    throw new Exception("doadd failed");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }else{
            try {
                throw  new Exception("productId can not be null");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return "Success";
    }


    @GetMapping("/doselectorders")
    public String doselectorders(HttpServletRequest request){
        List<Orders> list = ordersService.doselect();

        request.setAttribute("ordersList",list);

        return "shopcart";
    }

}
