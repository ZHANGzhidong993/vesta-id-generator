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
        IpConfigurableMachineIdProvider ipConfigurableMachineIdProvider = new IpConfigurableMachineIdProvider("192.168.5.171");
        idService.setMachineIdProvider(ipConfigurableMachineIdProvider);
        idService.init();
        long l = idService.genId();
        System.out.println(l);
    }
}
