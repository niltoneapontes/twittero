//
//  ComposeView.swift
//  iosApp
//
//  Created by Nilton Pontes on 03/06/24.
//  Copyright © 2024 bubblesolutions. All rights reserved.
//

import Foundation
import SwiftUI
import shared

struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> some UIViewController {
        AppKt.MainViewController()
    }
    
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {
    }
}
