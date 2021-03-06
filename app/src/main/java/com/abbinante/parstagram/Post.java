package com.abbinante.parstagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject
{
    public static final String KEY_DESCRIPTION = "description", KEY_IMAGE = "image",
            KEY_USER = "user", KEY_CREATED_KEY = "createdAt";

    public String getDescription()
    {
        return(getString(KEY_DESCRIPTION));
    }

    public ParseFile getImage()
    {
        return(getParseFile(KEY_IMAGE));
    }

    public ParseUser getUser() {
        return(getParseUser(KEY_USER));
    }

    public void setDescription(String description)
    {
        put(KEY_DESCRIPTION, description);
    }

    public void setImage(ParseFile parseFile)
    {
        put(KEY_IMAGE, parseFile);
    }

    public void setUser(ParseUser user)
    {
        put(KEY_USER, user);
    }
}
