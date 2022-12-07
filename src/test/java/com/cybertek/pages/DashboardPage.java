package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class DashboardPage extends BasePage {
    public AbstractButton userName;

    // no need to explicitly write constructor, because it will use parents constructor
    //       public DashboardPage (){
    //       PageFactory.initElements(Driver.get(), this)}
}
