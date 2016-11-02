package school.lemon.changerequest.java.introduction.pr1

import spock.lang.Specification
import spock.lang.Unroll


class HammingDistanceSpecification extends Specification {
    @Unroll
    def "test hamming distance of a=#a and a1=#a1 is #expectedResult"() {
        expect:
        HammingDistance.compute(a, a1) == expectedResult
        where:
        a              | a1             || expectedResult
        "A"            | "A"            || 0
        "A"            | "B"            || 1
        "Hello"        | "HELLO"        || 4
        "AT"           | "CT"           || 1
        "123"          | "1234"         || -1
        "12345"        | "54321"        || 4
        "GGACGGATTCTG" | "AGGACGGATTCT" || 9
    }
}