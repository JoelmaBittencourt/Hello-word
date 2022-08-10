import java.util.Objects;

class Programa {
    public static void main(String[] args) {
       var user2 = new User2("fulano", "15");
       var user3 = new User2("fulano", "15");
       System.out.println(user2);
       System.out.println(user3);
       System.out.println(user3.equals(user2));


    }
     static class User2 {
        private String name;
        private String age;

//    public User2(){}

        public User2(String name,String age){
            this.name = name;
            this.age = age;
        }

        public String getAge() {
            return age;

        }

        public String getName() {
            return name;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

         @Override
         public String toString() {
             return "[name ="+this.name+" ,age ="+this.age+"]";
         }

         @Override
         public boolean equals(Object obj) {
            var objUser = (User2)obj;
             return objUser.getName() == this.getName() && Objects.equals(objUser.getAge(), this.getAge());
         }
     }
}

