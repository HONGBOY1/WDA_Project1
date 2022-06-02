<Label>:
    font_name: 'Roboto'
    font_size: 20
    markup: True
 
<RobotoButton@Button>:
    font_name: 'Roboto'
    font_size: 25
    bold: True
 
    border: (2, 2, 2, 2)
 
 
BoxLayout:
    time_prop: time
    orientation: 'vertical'
 
    Label:
        id: time
        text: '[b]00[/b]:00:00'
        font_size: 45
 
    BoxLayout:
        height: 100
        orientation: 'horizontal'
        padding: 20
        spacing: 20
        size_hint: (1, None)
 
        RobotoButton:
            id: start_stop
            text: 'Start'
            font_name: 'Roboto'
            on_press: app.start_stop()
 
        RobotoButton:
            id: reset
            text: 'Reset'
            on_press: app.reset()
    Label:
        id: stopwatch
        text: '00:00.[size=35]00[/size]'
        font_size: 65