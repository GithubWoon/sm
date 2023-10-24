package login.entity;

public class Entity {
//    entity =데이터베이스 테이블과 매핑되는 객체,
//    User와 Manager라는 두 개의 엔티티 클래스가 필요하며 각각 사용자와 관리자 정보를 담고 있습니다
    public static class User{
        private String id;
        private String pw;
        private String name;
        public User(String id, String pw, String name){
            this.id = id;
            this.pw = pw;
            this.name = name;
        }
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPw() {
            return pw;
        }

        public void setPw(String pw) {
            this.pw = pw;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Manager{
        private String id;
        private String pw;
        private String name;
        public Manager(String id, String pw, String name){
            this.id = id;
            this.pw = pw;
            this.name = name;
        }
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPw() {
            return pw;
        }

        public void setPw(String pw) {
            this.pw = pw;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {

            this.name = name;
        }
    }
}
