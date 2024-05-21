library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;
use ieee.NUMERIC_STD.all;

entity booth is
	 port(
		 A : in signed(7 downto 0);
		 B : in signed(7 downto 0);
		 C : out signed(15 downto 0)
	     );
end booth;

architecture Behavior of booth is

begin
	
	process (A,B)
  variable tmp_B: signed(8 downto 0) ;
  variable tmp_out: signed(15 downto 0) ;
  variable tmp_A: signed(15 downto 0) ;
  variable fixed_A : signed(15 downto 0) ;
	variable i : integer ;

	begin

		tmp_b := "000000000" ;
		fixed_A := "0000000000000000" ;
		tmp_out := "0000000000000000" ;
    tmp_A := "0000000000000000";
    tmp_b(8 downto 1) := b ;
		fixed_A(7 downto 0 ) :=  A ;
	for i in 0 to 7 loop
		tmp_A := fixed_A ;
		if ((tmp_b(i+1 downto i) = "01")) then
			tmp_A :=  shift_left(tmp_A , i) ;
			tmp_out :=  tmp_out + tmp_A ;
		end if;
		if ((tmp_b(i+1 downto i) = "10"  )) then   --000101
			tmp_A := -tmp_A;

			tmp_A :=  shift_left(tmp_A , i) ;
			tmp_out := tmp_out + tmp_A ;
		end if ;
	end loop;
	c <=  tmp_out ;
	end process ;


end Behavior;
