package com.zzz.springcloud.gateaway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: GateAwayFilter
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/1213:15
 */
@Component
public class GateAwayFilter implements GlobalFilter, Ordered {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("***************in GateAway Filter!*****************");
        List<String> name = exchange.getRequest().getHeaders().get("name");
        if(name == null){
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            logger.info("***************校验规则不通过!*****************");
            return exchange.getResponse().setComplete();
        }
        logger.info("***************通过校验!*****************");
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
