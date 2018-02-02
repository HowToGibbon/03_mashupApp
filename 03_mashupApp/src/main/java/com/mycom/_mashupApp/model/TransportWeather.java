package com.mycom._mashupApp.model;

import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 5ia15niwallner on 01.02.2018.
 */

@SuppressWarnings("serial")
@Named
@XmlRootElement
public class TransportWeather implements Serializable {

        @NotNull
        private List<Connection> connection;

        @NotNull
        private Weather weather;

        public Object getConnection() {
            return connection;
        }

        public void setConnection(List<Connection> connection) {
            this.connection = connection;
        }

        public Object getWeather() {
            return weather;
        }

        public void setWeather(Weather weather) {
            this.weather = weather;
        }
}
