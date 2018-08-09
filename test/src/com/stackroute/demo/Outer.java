package com.stackroute.demo;

public class Outer {
        int x = 10;

        public class Nested
        {
            void display()
            {

                 System.out.println("inner class");
            }
        }
        void disp()
        {
            Nested x = new Nested();
            x.display();
        }

        public static void main(String[] args)
        {

            Outer n = new Outer();
            n.disp();

        }

}

}
