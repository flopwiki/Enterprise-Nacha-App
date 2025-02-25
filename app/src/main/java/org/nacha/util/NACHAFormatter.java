package org.nacha.util;

public record NACHAFormatter(
        int batchCount, // Total number of batches
        int blockCount, // total number of records divided by 10
        int entryAddendaCount, // total detail and addenda records
        long entryHash, // Hash total for entire file
        long totalDebitDollarAmount, // total debit amount (in cents)
        long totalCreditDollarAmount // total credit amount (int cents)
) {
        private static final char RECORD_TYPE = '9';
        private static final int DEBIT_CREDIT_AMOUNT_LENGTH = 10; // NACHA
        // requires 10 digits for amounts

        public String toNatchaString() {
                return String.format(
                        "%c%-6d%-6d%-8d%-10d%0" + DEBIT_CREDIT_AMOUNT_LENGTH +
                                "d%0" + DEBIT_CREDIT_AMOUNT_LENGTH + "d",
                        RECORD_TYPE,
                        batchCount,
                        blockCount,
                        entryAddendaCount,
                        entryHash,
                        totalDebitDollarAmount,
                        totalCreditDollarAmount
                );
        }
}
