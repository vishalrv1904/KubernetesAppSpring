package com.techprimers.lazy;

import org.springframework.stereotype.Service;


@Service
public class LazyService {

    public LazyService() {
        System.out.println("Lazy Service:: Constructor loaded");
    }

    public String hello() {
        return "Hello Vishal";
    }
}
