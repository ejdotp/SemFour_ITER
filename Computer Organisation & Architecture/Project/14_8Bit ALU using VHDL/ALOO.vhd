library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;
use ieee.NUMERIC_STD.all;

entity ALU is
	Port(
		A : in STD_LOGIC_VECTOR(7 downto 0);
		B : in STD_LOGIC_VECTOR(7 downto 0);
		ALU_Sel: in STD_LOGIC_VECTOR(3 downto 0);
		ALU_Out: out STD_LOGIC_VECTOR(7 downto 0);
		Carryout: out std_logic
	);
end ALU;