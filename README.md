
# react-native-arrows

## Getting started

`$ npm install react-native-arrows --save`

### Mostly automatic installation

`$ react-native link react-native-arrows`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-arrows` and add `RNArrows.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNArrows.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNArrowsPackage;` to the imports at the top of the file
  - Add `new RNArrowsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-arrows'
  	project(':react-native-arrows').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-arrows/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-arrows')
  	```


## Usage
```javascript
import RNArrows from 'react-native-arrows';

// TODO: What to do with the module?
RNArrows;
```
  