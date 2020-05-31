package com.company;

import java.io.IOException;

interface student{
    void addstudent();
    void display() throws IOException;
    void calculator();
}
interface Login{
    void newAccount();
    void checkSid();
}