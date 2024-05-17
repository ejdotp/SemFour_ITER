.global _start
_start:
	ldr r0, =0x10100000 //load register
	ldr r1, [r0], #4    //address +4
	ldr r2, [r0], #4
	adds r3, r1, r2
	str r3, [r0], #4    //store r3 at [r0]+4+4+4
	subs r4, r1, r2     //can do everything at r3 then store 
	str r4, [r0], #4
	mul r5, r1, r2
	str r5, [r0]
my_exit: b my_exit
// E. Jagadeeswar Patro, 2241016309
//lab4 obj 2
//input value at memory window
//compiled using CPULator, ARM7 Version