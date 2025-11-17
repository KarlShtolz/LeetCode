package org.example.solutions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CheckIfAll1sAreAtLeastLengthKPlacesAwayTest {
    CheckIfAll1sAreAtLeastLengthKPlacesAway c = new CheckIfAll1sAreAtLeastLengthKPlacesAway();
    @Test
    void kLengthApart1() {
        boolean expected = true;
        int [] arr = new int[]{1,0,0,0,1,0,0,1};
        int k = 2;
        Assert.assertEquals(expected, c.kLengthApart(arr, k));
    }
    @Test
    void kLengthApart2() {
        boolean expected = false;
        int [] arr = new int[]{1,0,0,1,0,1};
        int k = 2;
        Assert.assertEquals(expected, c.kLengthApart(arr, k));
    }
}