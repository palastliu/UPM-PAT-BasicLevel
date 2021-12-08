{\rtf1\ansi\ansicpg936\cocoartf2636
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset134 PingFangSC-Regular;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.Scanner;\
public class Main\{\
    \
    public static void main(String[] args)\{\
        int n=0;\
        Scanner Scanner=new Scanner(System.in);//
\f1 \'bd\'d3\'ca\'dc\'c9\'a8\'c3\'e8\'bc\'fc\'c5\'cc\'ca\'e4\'c8\'eb\'d0\'c5\'cf\'a2
\f0 \
        int a=Scanner.nextInt();\
        while(a!=1)\{\
            \
            if(a%2==0)\{\
                a=a/2;\
                n++;\
        \}\
            else\{\
                a=3*a+1;\
                a=a/2;\
                n++;\
            \}\
        \}\
        System.out.println(n);\
    \}\
    \
    \}}