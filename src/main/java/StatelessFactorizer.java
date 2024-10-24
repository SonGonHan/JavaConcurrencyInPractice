import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import net.jcip.annotations.ThreadSafe;

import java.io.IOException;
import java.math.BigInteger;

@ThreadSafe
public class StatelessFactorizer extends GenericServlet implements Servlet{

    public void service(ServletRequest req, ServletResponse resp){
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = factor(i);
        encodeIntoResponse(resp, factors);
    }

    void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {
    }

    BigInteger extractFromRequest(ServletRequest req) {
        return new BigInteger("7");
    }

    BigInteger[] factor(BigInteger i) {
        return new BigInteger[]{i};
    }

}
