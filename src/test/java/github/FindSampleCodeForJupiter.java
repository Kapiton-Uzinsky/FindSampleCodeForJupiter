package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FindSampleCodeForJupiter {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://github.com";
        Configuration.startMaximized = true;

    }


    @Test
    void shouldFindSelenideRepository() {

        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-box .js-wiki-more-pages-link").click();
        $(byText("SoftAssertions")).click();
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));

    }
}
