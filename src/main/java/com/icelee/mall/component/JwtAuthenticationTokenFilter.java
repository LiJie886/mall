//package com.icelee.mall.component;
//
//import com.icelee.mall.common.util.JwtTokenUtil;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @Description: JWT登录授权过滤器
// * @author: lijie
// * @date: 2021.08.19 15:46
// */
//public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
//    private static final Logger LOGGER = LoggerFactory.getLogger(JwtAuthenticationTokenFilter.class);
//    @Autowired
//    private UserDetailsService userDetailsService;
//    @Autowired
//    private JwtTokenUtil jwtTokenUtil;
//    @Value("${jwt.tokenHeader}")
//    private String tokenHeader;
//    @Value("${jwt.tokenHead}")
//    private String tokenHead;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request,
//                                    HttpServletResponse response,
//                                    FilterChain chain) throws ServletException, IOException {
//        String authHeader = request.getHeader(this.tokenHeader);
//        if (authHeader != null && authHeader.startsWith(this.tokenHead)) {
//            String authToken = authHeader.substring(this.tokenHead.length());// The part after "Bearer "
//            String username = jwtTokenUtil.getUserNameFromToken(authToken);
//            LOGGER.info("checking username:{}", username);
//            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//                UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
//                if (jwtTokenUtil.validateToken(authToken, userDetails)) {
//                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                    LOGGER.info("authenticated user:{}", username);
//                    SecurityContextHolder.getContext().setAuthentication(authentication);
//                }
//            }
//        }
//        chain.doFilter(request, response);
//    }
//}
