package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.BookDao;
import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional(
            //只读处理，不能有增删改，只能查询只读，不知道有什么用
//            readOnly = true
            //超时处理
//            timeout = 3
            //设置不造成回归的异常
//            noRollbackFor = ArithmeticException.class
//            noRollbackForClassName = "java.lang.ArithmeticException"
            //设置事务的隔离级别，好像和mysql有关，不知道什么意思
//            isolation = Isolation.DEFAULT
            //传播行为
            propagation = Propagation.REQUIRES_NEW
    )
    public void buyBook(Integer userId, Integer bookId) {
//        try {
//            //程序休眠时间
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }

        //查询图书的价格
        Integer price = bookDao.getPriceBookId(bookId);

        //更新图书的库存
        bookDao.updateStock(bookId);

        //更新用户的余额
        bookDao.updateBalance(userId,price);

//        System.out.println(1/0);
    }
}
