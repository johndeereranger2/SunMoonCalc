package com.deerbrain.sunmooncalc

class SunMoonManager {
}

////https://github.com/kanchudeep/SunMoonCalculator/blob/master/example.swift
//import Foundation
//
//
//class SunMoonManager: NSObject {
//    public static let instance = SunMoonManager()
//    private override init() {
//        super.init()
//        print(self, #function)
//    }
//
//    /** Method to display a textual representation of Date*/
//    func getDateAsString(date:Date, utc:Bool? = false) -> String {
//        var calendar:Calendar = Calendar.init(identifier: .gregorian)
//        if utc! {
//            calendar.timeZone = TimeZone.init(abbreviation: "UTC")!
//        }
//        let dc:DateComponents = calendar.dateComponents([.year, .month, .day, .hour, .minute, .second], from: date)
//        return String(format: "%d/%02d/%02d %02d:%02d:%02d", dc.year!, dc.month!, dc.day!, dc.hour!, dc.minute!, dc.second!)
//    }
//
//    func testSunMoon(){
//
//        do {
//            let smc:SunMoonCalculator = try SunMoonCalculator(date: Date(), longitude: 98.76543, latitude: 12.34567)
//                smc.calcSunAndMoon()
//                print(" - - Sun - -")
//                print("Azimuth:\t\t\(Float(smc.sunAzimuth.toDegrees))\u{00b0}")
//                print("Elevation:\t\t\(Float(smc.sunElevation.toDegrees))\u{00b0}")
//                print("Distance:\t\t\(Float(smc.sunDistance)) AU")
//                print("Rise:\t\t\t\(getDateAsString(date: try SunMoonCalculator.getDate(jd: smc.sunRise)))")
//                print("Set:\t\t\t\(getDateAsString(date: try SunMoonCalculator.getDate(jd: smc.sunSet)))")
//                print("Transit:\t\t\(getDateAsString(date: try SunMoonCalculator.getDate(jd: smc.sunTransit))) (max. elevation \(Float(smc.sunTransitElevation.toDegrees))\u{00b0})")
//                print(" - - Moon - -")
//                print("Azimuth:\t\t\(Float(smc.moonAzimuth.toDegrees))\u{00b0}")
//                print("Elevation:\t\t\(Float(smc.moonElevation.toDegrees))\u{00b0}")
//                print("Distance:\t\t\(Float(smc.moonDistance * SunMoonCalculator.AU)) km")
//                print("Age:\t\t\t\(Float(smc.moonAge)) days")
//                print("Illumination:\t\(Float(smc.moonIllumination * 100))%")
//                print("Phase:\t\t\t\(smc.moonPhase)")
//                print("Rise:\t\t\t\(getDateAsString(date: try SunMoonCalculator.getDate(jd: smc.moonRise)))")
//                print("Set:\t\t\t\(getDateAsString(date: try SunMoonCalculator.getDate(jd: smc.moonSet)))")
//                print("Transit:\t\t\(getDateAsString(date: try SunMoonCalculator.getDate(jd: smc.moonTransit))) (max. elevation \(Float(smc.moonTransitElevation.toDegrees))\u{00b0})")
//            } catch {
//                print("Failure!!!")
//            }
//        }
//
//
//    func getLunarHour(lat: Double, long: Double, date: Date ) -> Double? {
//        do {
//            let smc:SunMoonCalculator = try SunMoonCalculator(date: date, longitude: lat, latitude: long)
//                smc.calcSunAndMoon()
//                return (smc.moonAzimuth.toDegrees)
//            } catch {
//                print("failure to load data")
//            }
//            return nil
//        }
//}
