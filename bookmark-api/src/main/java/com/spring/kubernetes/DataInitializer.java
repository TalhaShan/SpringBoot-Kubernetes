//package com.spring.kubernetes;
//
//import com.spring.kubernetes.domain.BookMark;
//import com.spring.kubernetes.domain.BookMarkRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.time.Instant;
//
//@Component
//@RequiredArgsConstructor
//public class DataInitializer implements CommandLineRunner {
//
//    private final BookMarkRepository bookMarkRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//     bookMarkRepository.save(new BookMark(null,"Talha","https://dosesexist.com", Instant.now()));
//     bookMarkRepository.save(new BookMark(null,"Spring Book","https://dosesexist.com", Instant.now()));
//
//    }
//}
