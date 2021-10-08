package com.company;

public class Main {

    public static void main(String[] args) {

        /*    -2^(8-1) < Byte < 2^(8-1) - 1
            Ocupa 8 bits
         */
        byte miMinByteValue = Byte.MIN_VALUE;
        byte miMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value"+miMinByteValue);
        System.out.println("Byte Maximum Value"+miMaxByteValue);

        /*    -2^(16-1) < Short < 2^(16-1) - 1
            Ocupa 16 bits
         */
        short miMinShortValue = Short.MIN_VALUE;
        short miMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value"+miMinShortValue);
        System.out.println("Short Maximum Value"+miMaxShortValue);

        /*    -2^(32-1) < Integer < 2^(32-1) - 1
            Ocupa 32 bits
         */
        int miMinIntValue = Integer.MIN_VALUE;
        int miMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimun Value= "+miMinIntValue);
        System.out.println("Integer Maximum Value= "+miMaxIntValue);
        int maxInt = 2_147_483_647;

        /*    -2^(64-1) < Integer < 2^(64-1) - 1
            Ocupa 64 bits
         */
        long miMinLongValue = Long.MIN_VALUE;
        long miMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimun Value= "+miMinLongValue);
        System.out.println("Long Maximum Value= "+miMaxLongValue);
        long maxLong = 9_223_372_036_854_775_807L;

        /**
         * Operaciones con tipos de datos
         */
        byte myNewByteValue = (byte) (miMinByteValue/2);
        short myNewShortValue = (short) (miMinShortValue/2);

        /**
         * Challenge
         */
        byte miByte = 10;
        short miShort = 20;
        int miInt = 50;
        long miLong = 50_000L + 10L*(miByte+miShort+miInt);
        System.out.println(miLong);
    }
}
