library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;
use ieee.NUMERIC_STD.all;

architecture Behavioral of ALU is

	signal ALU_Result: std_logic_vector (7 downto 0);
	signal tmp :std_logic_vector (8 downto 0);

begin
	process(A, B, ALU_Sel)
	begin
		case ALU_Sel is
			when "0000"=>
				ALU Result<=A+B;
			when "0001"=>
				ALU_Result<=A-B;
			when "0010"=>
				ALU_Result <= std_logic_vector(to_unsigned((to_integer(unsigned(A))*to_integer(unsigned(B))), 8)):
			when "0011" ->
				ALU_Result <= std_logic_vector(to_unsigned((to_integer(unsigned(A))/to_integer(unsigned(B))), 8)):
			when "0100" ->
				ALU_Result <= std_logic_vector(unsigned(A) sll 1);
			when "0101"=>
				ALU _Result <= std_logic_vector(unsigned(A) srl 1);
			when "0110" =>
				ALU_Result <= std_logic_vector(unsigned(A) rol 1);
			when "0111"-2
				ALU_Result <- std_logic_vector(unsigned(A) ror 1);
			when "1000" ->
				ALU_Result <- A and B;
			when "1001"->
				ALU_Result <- A or B;
			when "1010" ->
				ALU_Result< A xor B;
			when "1011"->
				ALU_Result <= A nor B;
			when "1100" ->
				ALU_Result <= A nand B;
			when "1101" =>
				ALU_Result <= A xnor B;
			when"1110" =>
				ifA>B then
					ALU_Result <= x"01";
				else
					ALU_Result <=x"00"
				end if;
			when "1111" =>
				ifA=B then
					ALU_Result <=x"01";
				else
					ALU_Result <=x"00";
				end if;
			when others -> ALU_Result <=A+B; -- default
	end case;
end process;
ALU_Out<= ALU_Result;
tmp<=('0' & A)+(0'& B);
Carryout<=tmp(8);
end Behavioral;