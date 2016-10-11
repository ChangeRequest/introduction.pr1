package school.lemon.changerequest.java.pr1

import spock.lang.Specification
import spock.lang.Unroll

class BobSpecification extends Specification {
    @Unroll
    def "Bob should say #expectedResult for #input"() {
        expect:
        Bob.hey(input) == expectedResult
        where:
        input                                            || expectedResult
        "Tom-ay-to, tom-aaaah-to."                       || "Whatever."
        "WATCH OUT!"                                     || "Chill out!"
        "Does this cryogenic chamber make me look fat?"  || "Yeap."
        "You are, what, like 15?"                        || "Yeap."
        "Let's go make out behind the gym!"              || "Whatever."
        "It's OK if you don't want to go to the DMV."    || "Whatever."
        "WHAT THE HELL WERE YOU THINKING?"               || "Chill out!"
        "1, 2, 3 GO!"                                    || "Chill out!"
        "1, 2, 3"                                        || "Whatever."
        "4?"                                             || "Yeap."
        "ZOMG THE %^*@#\$(*^ ZOMBIES ARE COMING!!11!!1!" || "Chill out!"
        "\u00dcML\u00c4\u00dcTS!"                        || "Chill out!"
        "\u00dcML\u00e4\u00dcTS!"                        || "Whatever."
        "Ending with ? means a question."                || "Whatever."
        "I HATE YOU"                                     || "Chill out!"
        "Wait! Hang on. Are you going to be OK?"         || "Yeap."
        "                "                               || "Fine."
        ""                                               || "Fine."
    }
}