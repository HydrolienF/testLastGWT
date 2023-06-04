package fr.formiko.testlastgwt.client;

import fr.formiko.testlastgwt.LastGWT;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig() {
                // Resizable application, uses available space in browser
                return new GwtApplicationConfiguration(true);
        }

        @Override
        public ApplicationListener createApplicationListener() { return new LastGWT(); }
}