/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.noDuplicate.impl;

import array.noDuplicate.NoDuplicateVerificator;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Daniel
 */
public class NoDuplicateVerificatorStringUtilsImpl implements NoDuplicateVerificator {

    @Override
    public boolean verify(String inputString, char inputChar) {
        return StringUtils.countMatches(inputString, inputChar) <= 1;
    }
    
}
