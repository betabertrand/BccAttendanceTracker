//
//  ViewController.swift
//  BCCAttendanceTrackerIOS
//
//  Created by Bertrand Saint-Preux on 11/29/17.
//  Copyright © 2017 Bertrand. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    @IBOutlet weak var roomNumberPickerView: UIPickerView!
    @IBOutlet weak var timeSlotPickerView: UIPickerView!
    @IBOutlet weak var whichPartOfEventPickerView: UIPickerView!
    
    @IBOutlet weak var numCount: UILabel!
    @IBOutlet weak var countLabel: UILabel!
    var numCountVariable = 0;
    
    
    
    @IBAction func plusButton(_ sender: Any) {
        numCountVariable += 1;
        numCount.text = String(numCountVariable);
        print(numCountVariable);
    }
    @IBAction func minusButton(_ sender: Any) {
        if (numCountVariable > 0) {
            numCountVariable -= 1;
        }
        numCount.text = String(numCountVariable);
        print(numCountVariable);
    }
    @IBAction func submitButton(_ sender: Any) {
    }
    

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

