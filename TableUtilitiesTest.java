 

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/31/18.
 */
public class TableUtilitiesTest {
   
    @Test
    public void testGetMulplicationTable_forOne(){
        String expected = "  1 |\n";

        String actual = TableUtilities.getMultiplicationTable(1);
        Assert.assertEquals(expected, actual);
    }
    
        @Test
    public void testGetMulplicationTable_forTwo(){
        String expected = "  1 |  2 |\n" +
                          "  2 |  4 |\n";

        String actual = TableUtilities.getMultiplicationTable(2);
        Assert.assertEquals(expected, actual);
    }
    
    
    @Test
    public void testGetLargeMultiplicationTable() {
        String expected =
                "  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 |\n" +
                "  2 |  4 |  6 |  8 | 10 | 12 | 14 | 16 | 18 | 20 |\n" +
                "  3 |  6 |  9 | 12 | 15 | 18 | 21 | 24 | 27 | 30 |\n" +
                "  4 |  8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 | 40 |\n" +
                "  5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 | 50 |\n" +
                "  6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 | 60 |\n" +
                "  7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 | 70 |\n" +
                "  8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 | 80 |\n" +
                "  9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 | 90 |\n" +
                " 10 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 |100 |\n";

        String actual = TableUtilities.getLargeMultiplicationTable();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetSmallMultiplicationTable() {
        String expected =
                        "  1 |  2 |  3 |  4 |  5 |\n" +
                        "  2 |  4 |  6 |  8 | 10 |\n" +
                        "  3 |  6 |  9 | 12 | 15 |\n" +
                        "  4 |  8 | 12 | 16 | 20 |\n" +
                        "  5 | 10 | 15 | 20 | 25 |\n";

        String actual = TableUtilities.getSmallMultiplicationTable();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiplicationTable() {
        String expected =
                "  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n" +
                "  2 |  4 |  6 |  8 | 10 | 12 | 14 | 16 | 18 | 20 | 22 | 24 | 26 | 28 | 30 | 32 | 34 | 36 | 38 | 40 |\n" +
                "  3 |  6 |  9 | 12 | 15 | 18 | 21 | 24 | 27 | 30 | 33 | 36 | 39 | 42 | 45 | 48 | 51 | 54 | 57 | 60 |\n" +
                "  4 |  8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 | 40 | 44 | 48 | 52 | 56 | 60 | 64 | 68 | 72 | 76 | 80 |\n" +
                "  5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 | 50 | 55 | 60 | 65 | 70 | 75 | 80 | 85 | 90 | 95 |100 |\n" +
                "  6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 | 60 | 66 | 72 | 78 | 84 | 90 | 96 |102 |108 |114 |120 |\n" +
                "  7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 | 70 | 77 | 84 | 91 | 98 |105 |112 |119 |126 |133 |140 |\n" +
                "  8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 | 80 | 88 | 96 |104 |112 |120 |128 |136 |144 |152 |160 |\n" +
                "  9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 | 90 | 99 |108 |117 |126 |135 |144 |153 |162 |171 |180 |\n" +
                " 10 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 |100 |110 |120 |130 |140 |150 |160 |170 |180 |190 |200 |\n" +
                " 11 | 22 | 33 | 44 | 55 | 66 | 77 | 88 | 99 |110 |121 |132 |143 |154 |165 |176 |187 |198 |209 |220 |\n" +
                " 12 | 24 | 36 | 48 | 60 | 72 | 84 | 96 |108 |120 |132 |144 |156 |168 |180 |192 |204 |216 |228 |240 |\n" +
                " 13 | 26 | 39 | 52 | 65 | 78 | 91 |104 |117 |130 |143 |156 |169 |182 |195 |208 |221 |234 |247 |260 |\n" +
                " 14 | 28 | 42 | 56 | 70 | 84 | 98 |112 |126 |140 |154 |168 |182 |196 |210 |224 |238 |252 |266 |280 |\n" +
                " 15 | 30 | 45 | 60 | 75 | 90 |105 |120 |135 |150 |165 |180 |195 |210 |225 |240 |255 |270 |285 |300 |\n" +
                " 16 | 32 | 48 | 64 | 80 | 96 |112 |128 |144 |160 |176 |192 |208 |224 |240 |256 |272 |288 |304 |320 |\n" +
                " 17 | 34 | 51 | 68 | 85 |102 |119 |136 |153 |170 |187 |204 |221 |238 |255 |272 |289 |306 |323 |340 |\n" +
                " 18 | 36 | 54 | 72 | 90 |108 |126 |144 |162 |180 |198 |216 |234 |252 |270 |288 |306 |324 |342 |360 |\n" +
                " 19 | 38 | 57 | 76 | 95 |114 |133 |152 |171 |190 |209 |228 |247 |266 |285 |304 |323 |342 |361 |380 |\n" +
                " 20 | 40 | 60 | 80 |100 |120 |140 |160 |180 |200 |220 |240 |260 |280 |300 |320 |340 |360 |380 |400 |\n";
        String actual = TableUtilities.getMultiplicationTable(20);
        
        System.out.println(actual);
        System.out.println(expected);
        Assert.assertEquals(expected, actual);
    }

}