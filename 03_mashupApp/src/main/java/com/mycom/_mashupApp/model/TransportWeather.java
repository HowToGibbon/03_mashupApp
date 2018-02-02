package com.mycom._mashupApp.model;

import javax.inject.Named;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by 5ia15niwallner on 01.02.2018.
 */

@SuppressWarnings("serial")
@Named
@XmlRootElement
public class TransportWeather implements Serializable {

        @Id
        @GeneratedValue
        private Long id;

        @NotNull
        private Object connection;

        @NotNull
        private Object weather;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Object getConnection() {
            return connection;
        }

        public void setConnection(Object connection) {
            this.connection = connection;
        }

        public Object getWeather() {
            return weather;
        }

        public void setWeather(Object weather) {
            this.weather = weather;
        }
}
