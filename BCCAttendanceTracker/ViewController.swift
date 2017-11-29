//
//  ViewController.swift
//  BCCCounter
//
//  Created by Bertrand Saint-Preux on 11/20/17.
//  Copyright © 2017 Bertrand. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var roomNumberPickerView: UIPickerView!
    @IBOutlet weak var timeSlotPickerView: UIPickerView!
    @IBOutlet weak var whichPartOfEventPickerView: UIPickerView!
    
    @IBOutlet weak var minusButton: UIButton!
    @IBOutlet weak var plusButton: UIButton!
    @IBOutlet weak var numCount: UILabel!
    @IBOutlet weak var countLabel: UILabel!
    
    @IBOutlet weak var submitButton: UIButton!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

