class Anullment
          {
              public static void main(String[] args)
              {
                String word = "hello#world#how#are#you###";
                String[] cut = word.split("#", -2);
                for(String b : cut)
                    System.out.println(b);
                System.out.println(cut.length);
              }
          }
          /*hello
world
how
are
you



8 */