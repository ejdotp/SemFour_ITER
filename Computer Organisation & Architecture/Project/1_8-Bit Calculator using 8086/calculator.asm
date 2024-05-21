; 8-bit Calculator Program

.MODEL SMALL
.STACK 100H
.DATA

    operand1 DB ?
    operand2 DB ?
    result   DB ?
    operator DB ?
    msg1     DB "Enter first number: $"
    msg2     DB "Enter second number: $"
    msg3     DB "Enter operator (+ for addition, - for subtraction, & for logical AND): $"
    msg4     DB "Result: $"

.CODE
MAIN PROC

    MOV AX, @DATA
    MOV DS, AX

    ; Input first number
    MOV AH, 09H
    LEA DX, msg1
    INT 21H
    MOV AH, 01H
    INT 21H
    SUB AL, 30H
    MOV operand1, AL

    ; Input second number
    MOV AH, 09H
    LEA DX, msg2
    INT 21H
    MOV AH, 01H
    INT 21H
    SUB AL, 30H
    MOV operand2, AL

    ; Input operator
    MOV AH, 09H
    LEA DX, msg3
    INT 21H
    MOV AH, 01H
    INT 21H
    MOV operator, AL

    ; Perform operation
    CMP operator, '+'
    JE  ADDITION
    CMP operator, '-'
    JE  SUBTRACTION
    CMP operator, '&'
    JE  LOGICAL_AND

    JMP EXIT

ADDITION:
    MOV AL, operand1
    ADD AL, operand2
    MOV result, AL
    JMP DISPLAY_RESULT

SUBTRACTION:
    MOV AL, operand1
    SUB AL, operand2
    MOV result, AL
    JMP DISPLAY_RESULT

LOGICAL_AND:
    MOV AL, operand1
    AND AL, operand2
    MOV result, AL
    JMP DISPLAY_RESULT

DISPLAY_RESULT:
    ; Display result
    MOV AH, 09H
    LEA DX, msg4
    INT 21H

    MOV DL, result
    ADD DL, 30H
    MOV AH, 02H
    INT 21H

EXIT:
    MOV AH, 4CH
    INT 21H

MAIN ENDP
END MAIN