package com.lijun;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo;

/**
 * @author weed
 * @date 2020/8/15 0015 11:48
 * @description
 */
public class TestHealthCheck implements HealthCheckHandler {

    public InstanceInfo.InstanceStatus getStatus(InstanceInfo.InstanceStatus instanceStatus) {

        return null;
    }
}
