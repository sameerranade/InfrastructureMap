import org.openstack4j.api.OSClient;
import org.openstack4j.model.compute.Server;
import org.openstack4j.model.identity.Tenant;
import org.openstack4j.model.image.Image;
import org.openstack4j.openstack.OSFactory;

import java.util.List;

/**
 * Created by sameer on 11/24/15.
 */
public class Inframap {

    public static void main(String[] args) {
        System.out.println("Hi");

        OSClient os = OSFactory.builder()
                .endpoint("http://10.0.2.15:5000/v2.0")
                .credentials("admin", "SRmay123")
                .tenantName("admin")
                .authenticate();

        int i = 0;
        List<? extends Tenant> tenants = os.identity().tenants().list();
        List<? extends Server> servers = os.compute().servers().list();

        System.out.println(tenants.size());
        System.out.println(servers.size());
        List<? extends Image> images = os.images().list();
        System.out.println(images.size());
        for(i=0;i<images.size();i++){
        }
    }
}