-------------------------------------------------------------------------------
-- Project           : Booth's Algorithm
-- Prsented To       : Dr.Khaled AlShafey
-- University / Dep  : Faculty of engineering - Al Azhar University - CS Dep.
-- Prsented By       : 1- Mohamed Salah Sayed [102] 
--                     2- Ahmed Mohamed Atya [16]
--                     3- Mohamed Hosam Bayome [96]                  
-------------------------------------------------------------------------------
--
-- Description :
-- Booth algorithm gives a procedure for multiplying binary integers in signed 2’s 
-- complement representation in efficient way, i.e., less number of additions/subtractions required.
-- It operates on the fact that strings of 0’s in the multiplier require no addition but just shifting 
-- and a string of 1’s in the multiplier from bit weight 2^k to weight 2^m can be treated as 2^(k+1 ) to 2^m.
-- As in all multiplication schemes, booth algorithm requires examination of the multiplier bits and shifting
-- of the partial product. Prior to the shifting, the multiplicand may be added to the partial product,
-- subtracted from the partial product, or left unchanged according to following rules:

-- 1- The multiplicand is subtracted from the partial product upon encountering 
-- the first least significant 1 in a string of 1’s in the multiplier
--
-- 2- The multiplicand is added to the partial product upon encountering the first 0 
-- (provided that there was a previous ‘1’) in a string of 0’s in the multiplier.
--
-- 3-The partial product does not change when the multiplier bit is identical
-- to the previous multiplier bit.
--
-------------------------------------------------------------------------------

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
