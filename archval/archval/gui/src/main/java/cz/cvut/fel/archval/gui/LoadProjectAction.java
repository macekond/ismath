/*
 *  The MIT License
 * 
 *  Copyright 2011 martin.
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package cz.cvut.fel.archval.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.util.Exceptions;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;

public final class LoadProjectAction implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        InputOutput io = IOProvider.getDefault().getIO("Task", true);
        io.select();
        io.getOut().println("huhumessage");
        io.getErr().println("this is error message");
        io.getOut().println("tired... gonna sleep");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Exceptions.printStackTrace(ex);
        }
        io.select();
        io.getOut().print("slept well!");
        io.getOut().close();
        io.getErr().close();
    }
}
