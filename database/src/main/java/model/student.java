package model;

import org.springframework.context.annotation.Scope;

import java.util.List;

public class student {
        private String name;
        private String email;
        private String id;
        private String sex;
        private List<String> score;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public List<String> getScore() {
            return score;
        }

        public void setScore(List<String> score) {
            this.score = score;
        }
}
