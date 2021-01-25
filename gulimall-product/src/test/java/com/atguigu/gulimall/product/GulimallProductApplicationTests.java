package com.atguigu.gulimall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.atguigu.gulimall.product.controller.CategoryController;
import com.atguigu.gulimall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {


//    @Resource
//    OSS ossClient;

    @Autowired
    CategoryService categoryService;

    @Test
    public void testFindPath(){
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        log.info("完整路径:{}", Arrays.asList(catelogPath));
    }

//    @Test
//    public void testUpload() throws FileNotFoundException {
////        // Endpoint以杭州为例，其它Region请按实际情况填写。
////        String endpoint ="oss-cn-guangzhou.aliyuncs.com";
////    // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
////        String accessKeyId = "LTAI4GE95wXZop5FjozfxFSv";
////        String accessKeySecret = "CbXtd0ebYVulxMr5N6qtqq6sUy0Lq9";
////
////// 创建OSSClient实例。
////        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//// 上传文件流。
//        InputStream inputStream = new FileInputStream("C:\\Users\\Administrator\\Documents\\Tencent Files\\734873995\\FileRecv\\MobileFile\\Screenshot_2020-10-14-21-44-37-671_com.tencent.mo.jpg");
//        ossClient.putObject("gulimall-zouxuan", "Screenshot_2020-10-14-21-44-37-671_com.tencent.mo.jpg", inputStream);
//
//// 关闭OSSClient。
//        ossClient.shutdown();
//
//        System.out.println("上传成功！！！");
//    }

}
