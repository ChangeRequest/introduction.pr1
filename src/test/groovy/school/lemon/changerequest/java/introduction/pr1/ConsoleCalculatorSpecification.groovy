package school.lemon.changerequest.java.introduction.pr1

import org.junit.Rule
import org.junit.contrib.java.lang.system.TextFromStandardInputStream
import spock.lang.Specification

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream


class ConsoleCalculatorSpecification extends Specification {
    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    def originalOut = System.out
    def PrintStream out = Mock(PrintStream)

    def setup() {
        System.setOut(out)
    }

    def cleanup() {
        System.setOut(originalOut)
    }

    def "test addition"() {
        setup:
        systemInMock.provideLines("add", "1", "2", "exit")
        when:
        ConsoleCalculator.main([] as String[])
        then:
        1 * out.println({ it.contains("1+2") && it.contains("3") })
    }

    def "test subtraction"() {
        setup:
        systemInMock.provideLines("sub", "1", "2", "exit")
        when:
        ConsoleCalculator.main([] as String[])
        then:
        1 * out.println({ it.contains("1-2") && it.contains("-1") })
    }

    def "test multiplication"() {
        setup:
        systemInMock.provideLines("mul", "2", "2", "exit")
        when:
        ConsoleCalculator.main([] as String[])
        then:
        1 * out.println({ it.contains("2*2") && it.contains("4") })
    }

    def "test division"() {
        setup:
        systemInMock.provideLines("div", "2", "2", "exit")
        when:
        ConsoleCalculator.main([] as String[])
        then:
        1 * out.println({ it.contains("2/2") && it.contains("1") })
    }

    def "test exit"() {
        setup:
        systemInMock.provideLines("exit")
        when:
        ConsoleCalculator.main([] as String[])
        then:
        1 * out.println({ it.contains("Bye-bye") })
    }
}