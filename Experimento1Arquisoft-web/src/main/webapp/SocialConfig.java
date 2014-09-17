/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.FourDots.bos;

import org.springframework.core.env.Environment;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.SocialConfigurer;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;

/**
 *
 * @author estudiante
 */
public class SocialConfig implements SocialConfigurer
{
    
    public static String CLIENT_ID = "348405295336411";
    public static String CLIENT_SECRET = "f3dc80a87498a9c645b286018756491d";

    /**
     *
     * @param cfc
     * @param e
     */
    @Override
    public void addConnectionFactories(ConnectionFactoryConfigurer cfc, Environment e)
    {
        cfc.addConnectionFactory(new FacebookConnectionFactory(CLIENT_ID,CLIENT_SECRET));
    }

    @Override
    public UserIdSource getUserIdSource()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator cfl)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
