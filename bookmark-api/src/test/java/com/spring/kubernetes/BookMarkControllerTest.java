//package com.spring.kubernetes;
//
//import com.spring.kubernetes.domain.BookMark;
//import com.spring.kubernetes.domain.BookMarkRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.web.servlet.MockMvc;
//
//
//import org.springframework.test.web.servlet.ResultMatcher;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.testcontainers.shaded.org.hamcrest.CoreMatchers;
//
//import java.time.Instant;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
//@TestPropertySource(properties = {
//        "spring.datasource.url=jdbc:tc:postgresql:14-alpine:///demo"
//})
//public class BookMarkControllerTest {
//
//    @Autowired
//    private  MockMvc mvc;
//
//    @Autowired
//    private BookMarkRepository bookMarkRepository;
//
//    private List<BookMark> bookmarks;
//
//    @BeforeEach
//    void setUp(){
//        bookMarkRepository.deleteAllInBatch();
//        bookmarks = new ArrayList<>();
//        bookmarks.add(new BookMark(null, "SivaLabs", "https://sivalabs.in", Instant.now()));
//        bookmarks.add(new BookMark(null, "SpringBlog", "https://spring.io/blog", Instant.now()));
//        bookmarks.add(new BookMark(null, "Quarkus", "https://quarkus.io/", Instant.now()));
//        bookmarks.add(new BookMark(null, "Micronaut", "https://micronaut.io/", Instant.now()));
//        bookmarks.add(new BookMark(null, "JOOQ", "https://www.jooq.org/", Instant.now()));
//        bookmarks.add(new BookMark(null, "VladMihalcea", "https://vladmihalcea.com", Instant.now()));
//        bookmarks.add(new BookMark(null, "Thoughts On Java", "https://thorben-janssen.com/", Instant.now()));
//        bookmarks.add(new BookMark(null, "DZone", "https://dzone.com/", Instant.now()));
//        bookmarks.add(new BookMark(null, "DevOpsBookmarks", "http://www.devopsbookmarks.com/", Instant.now()));
//        bookmarks.add(new BookMark(null, "Kubernetes docs", "https://kubernetes.io/docs/home/", Instant.now()));
//        bookmarks.add(new BookMark(null, "Expressjs", "https://expressjs.com/", Instant.now()));
//        bookmarks.add(new BookMark(null, "Marcobehler", "https://www.marcobehler.com", Instant.now()));
//        bookmarks.add(new BookMark(null, "baeldung", "https://www.baeldung.com", Instant.now()));
//        bookmarks.add(new BookMark(null, "devglan", "https://www.devglan.com", Instant.now()));
//        bookmarks.add(new BookMark(null, "linuxize", "https://linuxize.com", Instant.now()));
//
//        bookMarkRepository.saveAll(bookmarks);
//
//
//    }
//    @ParameterizedTest
//    @CsvSource({
//            "1,15,2,1,true,false,true,false",
//            "2,15,2,2,false,true,false,true"
//    })
//    //@Test
//    void shouldGetBookmarks(int pageNo, int totalElements, int totalPages, int currentPage,
//                            boolean isFirst, boolean isLast,
//                            boolean hasNext, boolean hasPrevious) throws Exception {
//        mvc.perform(MockMvcRequestBuilders.get("/api/bookmarks?page="+pageNo))
//                .andExpect(status().isOk())
//                .andExpect((ResultMatcher) jsonPath("$.totalElements", CoreMatchers.equalTo(totalElements)))
//                .andExpect((ResultMatcher) jsonPath("$.totalPages", CoreMatchers.equalTo(totalPages)))
//                .andExpect((ResultMatcher) jsonPath("$.currentPage", CoreMatchers.equalTo(currentPage)))
//                .andExpect((ResultMatcher) jsonPath("$.isFirst", CoreMatchers.equalTo(isFirst)))
//                .andExpect((ResultMatcher) jsonPath("$.isLast", CoreMatchers.equalTo(isLast)))
//                .andExpect((ResultMatcher) jsonPath("$.hasNext", CoreMatchers.equalTo(hasNext)))
//                .andExpect((ResultMatcher) jsonPath("$.hasPrevious", CoreMatchers.equalTo(hasPrevious)))
//        ;
//    }
//
//}
