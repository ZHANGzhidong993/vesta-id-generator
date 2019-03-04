import com.zzd.vesta.provider.IpConfigurableMachineIdProvider;
import com.zzd.vesta.service.impl.IdServiceImpl;
import org.junit.Test;

/**
 * @author zhangzhidong
 * @create: 2019-03-03 22:30
 */

public class Mytest {

    @Test
    public void test() {
        IdServiceImpl idService = new IdServiceImpl();
        IpConfigurableMachineIdProvider ipConfigurableMachineIdProvider = new IpConfigurableMachineIdProvider("10.10.36.75");
        idService.setMachineIdProvider(ipConfigurableMachineIdProvider);
        idService.init();
        long l = idService.genId();
        System.out.println(l);
    }

    @Test
    public void testb() {
        long a = 2L;//10
        long b = 3L;//11
        long c = a | b;//11
        long d = a & b;// 10
        System.out.println("a | b = " + c);
        System.out.println("a & b = " + d);
    }

    @Test
    public void testc() {
        System.out.println(Long.toBinaryString(-1L << 20));
        System.out.println(Long.toBinaryString(-1L));
        long l = -1L ^ -1L << 20;
        System.out.println(Long.toBinaryString(l));
    }

}
