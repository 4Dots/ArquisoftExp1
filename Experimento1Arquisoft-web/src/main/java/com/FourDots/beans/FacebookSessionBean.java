/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.FourDots.beans;

import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author estudiante
 */
@RequestMapping("/")
public class FacebookSessionBean
{

    /**
     * 
     */
    private Facebook facebook;
    
    
    
    /**
     * Creates a new instance of FacebookSessionBean
     */
    public FacebookSessionBean(Facebook fb)
    {
        this.facebook = fb;
    }

    @RequestMapping(method=RequestMethod.GET)
    public String auth(Model model)
    {
        if (!facebook.isAuthorized()) {
            return "redirect:/connect/facebook";
        }
        
        model.addAttribute(facebook.userOperations().getUserProfile());
        PagedList<Post> homeFeed = facebook.feedOperations().getHomeFeed();
        model.addAttribute("feed", homeFeed);

        return "hello";
    }
}
