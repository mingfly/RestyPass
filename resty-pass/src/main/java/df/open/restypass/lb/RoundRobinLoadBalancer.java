package df.open.restypass.lb;

import df.open.restypass.command.RestyCommand;
import df.open.restypass.lb.server.ServerContext;
import df.open.restypass.lb.server.ServerInstance;

import java.util.Set;

/**
 * 轮询调度
 * 负载均衡
 * Created by darrenfu on 17-7-30.
 */
public class RoundRobinLoadBalancer implements LoadBalancer {
    @Override
    public ServerInstance choose(ServerContext context, RestyCommand command, Set<String> excludeInstanceIdList) {
        return null;
    }
}