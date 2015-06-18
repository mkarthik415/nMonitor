package com.abb.nmonitor;

import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import java.io.IOException;

/**
 * <p>Title:com.abb.nmonitor</p>
 *
 * <p>Description:</p>
 *
 * <p>Copyright: Copyright (c) 2014 ? 2014 Ventyx an ABB Company * Rights
 * Reserved. Confidential and Proprietary</p>
 *
 * <p>Company: Ventyx an ABB Company</p>
 *
 * @author USKAMAR3
 * @version 1.0
 * Created on 6/18/2015.
 */
public class NMonitor {
    private Form current;

    public void init(Object context) {
        try{
            Resources theme = Resources.openLayered("/theme");
            UIManager.getInstance().setThemeProps(theme.getTheme(theme.getThemeResourceNames()[0]));
       }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void start() {
        if(current != null){
            current.show();
            return;
        }
        Form hi = new Form("nMonitor");
        hi.addComponent(new Label("Hi World"));
        hi.show();
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }

    public void destroy() {
    }
}
