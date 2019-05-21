package analizer;

import java_cup.runtime.*;

%%

%public
%class Lexer
%cup
%cupdebug
%line
%column

entero = "-"?[:digit:]+
decimal = {entero}[.][:digit:]+
grades = {decimal}("N"|"S"|"W"|"E")
recordID = "C"|"G"|"I"|"L"|"P"|"R"|"S"|"T"|"W"		
statusID = "TS"|"TD"|"HU"|"EX"|"SD"|"SS"|"LO"|"WV"|"DB"|"ET"|"PT"|"ST"|"TY"
code = [:jletter:][:jletter:]{entero}
name = ([:jletter:])([:jletterdigit:]|[-]|[_]|[ ])*

LineTerminator = \r|\n|\r\n|null
WhiteSpace     = {LineTerminator} | [ \t\f]

%{
  	StringBuilder string = new StringBuilder();

	private Symbol symbol(int type) {
  	return new Symbol(type, yyline+1, yycolumn+1);
	}

	private Symbol symbol(int type, Object value) {
  	return new Symbol(type, yyline+1, yycolumn+1, value);
	}

	private void error(String message) {
  	System.out.println("Error en linea line "+(yyline+1)+", columna "+(yycolumn+1)+" : "+message);
	}

	private void imprimirToken(String textSalida){
		System.out.println("Leido: >> " + textSalida + " <<");
	}

%}

%%

<YYINITIAL>{

	"0END0"			{return symbol(sym.END, yytext());}
	{entero}		{return symbol(sym.ENTERO, yytext());}
	{grades}		{return symbol(sym.GRADES, yytext());}
	{recordID}		{return symbol(sym.RECORD_ID, yytext());}
	{statusID}		{return symbol(sym.STATUS_ID, yytext());}
	{code}			{return symbol(sym.CODE, yytext());}
	{name}			{return symbol(sym.NAME, yytext());}
	","				{return symbol(sym.COMA, yytext());}
  	{WhiteSpace}      {/*Nothing to do*/}
}

[^] {error("Simbolo invalido << "+ yytext()+" >>");}
<<EOF>> { return symbol(sym.EOF); }