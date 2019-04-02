/*
 * Copyright 2019 Patriot project
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.patriot_framework.network.simulator.api.model.routes;

import io.patriot_framework.network.simulator.api.model.devices.router.Router;

import java.util.Objects;

/**
 * Wrapper class for RouterImpl and network. Representing next hop in the network topology.
 */
public class NextHop {
    private Router router;
    private Integer network;

    /**
     * Instantiates a new Next hop.
     *
     * @param router  the router
     * @param network the network
     */
    public NextHop(Router router, Integer network) {
        this.router = router;
        this.network = network;
    }

    /**
     * Gets router.
     *
     * @return the router
     */
    public Router getRouter() {
        return router;
    }

    /**
     * Sets router.
     *
     * @param router the router
     */
    public void setRouter(Router router) {
        this.router = router;
    }

    /**
     * Gets network.
     *
     * @return the network
     */
    public Integer getNetwork() {
        return network;
    }

    /**
     * Sets network.
     *
     * @param network the network
     */
    public void setNetwork(Integer network) {
        this.network = network;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NextHop nextHop = (NextHop) o;
        return Objects.equals(getRouter(), nextHop.getRouter()) &&
                getNetwork().equals(nextHop.getNetwork());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRouter(), getNetwork());
    }
}
